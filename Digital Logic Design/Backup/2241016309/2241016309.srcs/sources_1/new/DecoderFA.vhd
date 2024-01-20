----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 02:15:27 PM
-- Design Name: 
-- Module Name: DecoderFA - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
-- E. Jagadeeswar Patro
entity DecoderFA is
    Port ( a, b, c : in STD_LOGIC;
           sum, carry : out STD_LOGIC);
end DecoderFA;

architecture Dataflow of DecoderFA is
begin
sum <= ((not a) and (not b) and c) or ((not a) and b and (not c)) or (a and (not b) and (not c)) or (a and b and c);
carry <= ((not a) and b and c) or (a and (not b) and c) or (a and b and (not c)) or (a and b and c);
end Dataflow;
